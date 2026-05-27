package com.carddemo.transform;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/**
 * Deterministic UUID factory.
 * UUID = first 32 hex chars of SHA-256(path + ':' + kind + ':' + startLine + ':' + startCol),
 * formatted as 8-4-4-4-12.
 *
 * Rule 2 of the championship contract: same source -> same UUID across runs.
 */
public final class UuidFactory {

    private UuidFactory() {}

    public static UUID forNode(String filePath, String kind, int startLine, int startCol) {
        String key = filePath + ":" + kind + ":" + startLine + ":" + startCol;
        return fromString(key);
    }

    public static UUID forSymbol(String programName, String identifier, int definitionLine) {
        String key = "sym:" + programName + ":" + identifier + ":" + definitionLine;
        return fromString(key);
    }

    public static UUID forEdge(String kind, UUID from, UUID to, String discriminator) {
        String key = "edge:" + kind + ":" + from + ":" + to + ":" + (discriminator == null ? "" : discriminator);
        return fromString(key);
    }

    public static UUID fromString(String key) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] digest = md.digest(key.getBytes(StandardCharsets.UTF_8));
            StringBuilder hex = new StringBuilder(32);
            for (int i = 0; i < 16; i++) {
                hex.append(String.format("%02x", digest[i]));
            }
            String s = hex.toString();
            String formatted = s.substring(0, 8) + "-"
                    + s.substring(8, 12) + "-"
                    + s.substring(12, 16) + "-"
                    + s.substring(16, 20) + "-"
                    + s.substring(20, 32);
            return UUID.fromString(formatted);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("SHA-256 not available", e);
        }
    }
}
