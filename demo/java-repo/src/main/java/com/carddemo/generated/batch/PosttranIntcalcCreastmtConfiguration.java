// Generated from the LLM-authored batch chain spec.
// Chain: parsed JCL artifacts -> LLM JSON spec -> Spring Batch skeleton.
// The LLM output is grounded against the SQLite artifact graph; this file
// reflects exactly what the grounded spec specified.
package com.carddemo.generated.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * This batch chain processes daily financial transactions, calculates applicable interest
 * based on updated account data, and then generates comprehensive customer statements. It
 * ensures all account balances and transaction histories are current before producing the
 * final consolidated view for customers.
 *
 * <p><strong>Spring Batch implementation guidance (from LLM):</strong>
 * This job chain should be structured as a single Spring Batch Job with multiple sequential
 * steps, one for each legacy job (POSTTRAN, INTCALC, CREASTMT). The steps executing COBOL
 * programs (CBTRN02C, CBACT04C, CBSTM03A) are good candidates for chunk-oriented processing,
 * using custom ItemReaders for the VSAM files (or JdbcReaders if migrated to RDBMS) and
 * ItemWriters for updates. Utility steps (IDCAMS, SORT, IEFBR14) in CREASTMT can be
 * implemented as Tasklet steps, performing file operations, data transformations, or invoking
 * external scripts. Data handoffs between jobs, particularly for updated VSAM files, can be
 * managed by ensuring the underlying data store is correctly updated and accessed sequentially
 * by subsequent steps, with careful consideration for data consistency.
 *
 * <p><strong>Dataset hand-offs:</strong>
 * <ul>
 *   <li>POSTTRAN/TRANFILE &rarr; CREASTMT/SORTIN (<code>AWS.M2.CARDDEMO.TRANSACT.VSAM.KSDS</code>)
 *   <li>POSTTRAN/ACCTFILE &rarr; INTCALC/ACCTFILE (<code>AWS.M2.CARDDEMO.ACCTDATA.VSAM.KSDS</code>)
 *   <li>INTCALC/ACCTFILE &rarr; CREASTMT/ACCTFILE (<code>AWS.M2.CARDDEMO.ACCTDATA.VSAM.KSDS</code>)
 *   <li>POSTTRAN/XREFFILE &rarr; INTCALC/XREFFILE (<code>AWS.M2.CARDDEMO.CARDXREF.VSAM.KSDS</code>)
 *   <li>INTCALC/XREFFILE &rarr; CREASTMT/XREFFILE (<code>AWS.M2.CARDDEMO.CARDXREF.VSAM.KSDS</code>)
 *   <li>POSTTRAN/TCATBALF &rarr; INTCALC/TCATBALF (<code>AWS.M2.CARDDEMO.TCATBALF.VSAM.KSDS</code>)
 * </ul>
 *
 * <p><strong>Migration risks:</strong>
 * <ul>
 *   <li>VSAM Data Stores: The extensive use of VSAM KSDS files (e.g., ACCTDATA, TRANSACT) requires careful re-platforming to modern data stores (e.g., RDBMS, object storage, NoSQL), which will necessitate custom ItemReaders/Writers or data migration strategies.
 *   <li>JCL Utilities (IDCAMS, SORT, IEFBR14): These mainframe utilities perform critical functions like data definition, copying, sorting, and management. Their functionality must be re-implemented using Java APIs or integrated third-party tools within Spring Batch tasklets or custom ItemProcessors.
 *   <li>COBOL Program Inter-Calls: The calls between COBOL programs (e.g., CBSTM03A calling CBSTM03B) indicate tightly coupled logic. This requires careful refactoring during migration to maintain transactional integrity and might lead to merging logic into single Spring Batch components.
 *   <li>STEPLIB Dependencies: The reliance on AWS.M2.CARDDEMO.LOADLIB suggests shared libraries. These external dependencies need to be identified, their functionality replicated or adapted, and properly managed within the Spring Batch application's classpath and deployment.
 * </ul>
 *
 * <p>Chain: POSTTRAN -> INTCALC -> CREASTMT
 */
@Configuration
public class PosttranIntcalcCreastmtConfiguration {

    /**
     * Job POSTTRAN: This job posts daily financial transactions to various account and transaction files, updating customer balances and transaction histories accordingly.
     */
    @Bean
    public Job posttranJob(JobRepository jobRepository,
            @Qualifier("transactionManager") PlatformTransactionManager txManager) {
        return new JobBuilder("POSTTRAN", jobRepository)
            .start(step15Step(jobRepository, txManager))
            .build();
    }

    /**
     * Step STEP15 — invokes program CBTRN02C (uuid: b173b980-6330-1619-d02d-443c046b3561).
     * <p>Purpose: Reads daily transaction records and applies them to update account, transaction, and cross-reference files.
     */
    @Bean
    public Step step15Step(JobRepository jobRepository,
            @Qualifier("transactionManager") PlatformTransactionManager txManager) {
        Tasklet tasklet = (contribution, chunkContext) -> {
            // TODO: replace with translated logic from COBOL program CBTRN02C.
            //       Inputs / outputs / dispositions are documented in the JCL DD list.
            return RepeatStatus.FINISHED;
        };
        return new StepBuilder("step15", jobRepository)
            .tasklet(tasklet, txManager)
            .build();
    }

    /**
     * Job INTCALC: This job calculates interest based on the latest account and transaction data, applying it to relevant account records.
     */
    @Bean
    public Job intcalcJob(JobRepository jobRepository,
            @Qualifier("transactionManager") PlatformTransactionManager txManager) {
        return new JobBuilder("INTCALC", jobRepository)
            .start(step15Step(jobRepository, txManager))
            .build();
    }

    /**
     * Step STEP15 — invokes program CBACT04C (uuid: 5dd6a046-ba7e-34da-26b9-a46e3f32fcd2).
     * <p>Purpose: Reads account and transaction data to compute and apply interest, updating account balances.
     */
    @Bean
    public Step step15Step(JobRepository jobRepository,
            @Qualifier("transactionManager") PlatformTransactionManager txManager) {
        Tasklet tasklet = (contribution, chunkContext) -> {
            // TODO: replace with translated logic from COBOL program CBACT04C.
            //       Inputs / outputs / dispositions are documented in the JCL DD list.
            return RepeatStatus.FINISHED;
        };
        return new StepBuilder("step15", jobRepository)
            .tasklet(tasklet, txManager)
            .build();
    }

    /**
     * Job CREASTMT: This job aggregates account, customer, and transaction information to generate comprehensive customer statements.
     */
    @Bean
    public Job creastmtJob(JobRepository jobRepository,
            @Qualifier("transactionManager") PlatformTransactionManager txManager) {
        return new JobBuilder("CREASTMT", jobRepository)
            .start(deldef01Step(jobRepository, txManager))
            .next(step010Step(jobRepository, txManager))
            .next(step020Step(jobRepository, txManager))
            .next(step030Step(jobRepository, txManager))
            .next(step040Step(jobRepository, txManager))
            .build();
    }

    /**
     * Step DELDEF01 — invokes program IDCAMS (uuid: —).
     * <p>Purpose: Utility used for managing datasets, likely for deletion or definition prior to processing.
     */
    @Bean
    public Step deldef01Step(JobRepository jobRepository,
            @Qualifier("transactionManager") PlatformTransactionManager txManager) {
        Tasklet tasklet = (contribution, chunkContext) -> {
            // TODO: replace with translated logic from COBOL program IDCAMS.
            //       Inputs / outputs / dispositions are documented in the JCL DD list.
            return RepeatStatus.FINISHED;
        };
        return new StepBuilder("deldef01", jobRepository)
            .tasklet(tasklet, txManager)
            .build();
    }

    /**
     * Step STEP010 — invokes program SORT (uuid: —).
     * <p>Purpose: Sorts transaction data in preparation for statement generation.
     */
    @Bean
    public Step step010Step(JobRepository jobRepository,
            @Qualifier("transactionManager") PlatformTransactionManager txManager) {
        Tasklet tasklet = (contribution, chunkContext) -> {
            // TODO: replace with translated logic from COBOL program SORT.
            //       Inputs / outputs / dispositions are documented in the JCL DD list.
            return RepeatStatus.FINISHED;
        };
        return new StepBuilder("step010", jobRepository)
            .tasklet(tasklet, txManager)
            .build();
    }

    /**
     * Step STEP020 — invokes program IDCAMS (uuid: —).
     * <p>Purpose: Utility used to load sorted sequential transaction data into a VSAM KSDS file.
     */
    @Bean
    public Step step020Step(JobRepository jobRepository,
            @Qualifier("transactionManager") PlatformTransactionManager txManager) {
        Tasklet tasklet = (contribution, chunkContext) -> {
            // TODO: replace with translated logic from COBOL program IDCAMS.
            //       Inputs / outputs / dispositions are documented in the JCL DD list.
            return RepeatStatus.FINISHED;
        };
        return new StepBuilder("step020", jobRepository)
            .tasklet(tasklet, txManager)
            .build();
    }

    /**
     * Step STEP030 — invokes program IEFBR14 (uuid: —).
     * <p>Purpose: Utility program often used for dataset allocation, deletion, or manipulation.
     */
    @Bean
    public Step step030Step(JobRepository jobRepository,
            @Qualifier("transactionManager") PlatformTransactionManager txManager) {
        Tasklet tasklet = (contribution, chunkContext) -> {
            // TODO: replace with translated logic from COBOL program IEFBR14.
            //       Inputs / outputs / dispositions are documented in the JCL DD list.
            return RepeatStatus.FINISHED;
        };
        return new StepBuilder("step030", jobRepository)
            .tasklet(tasklet, txManager)
            .build();
    }

    /**
     * Step STEP040 — invokes program CBSTM03A (uuid: 98cd097a-95da-4e06-1572-7613d3b00bde).
     * <p>Purpose: Reads various data files (account, customer, transaction) to compose and generate customer statements.
     */
    @Bean
    public Step step040Step(JobRepository jobRepository,
            @Qualifier("transactionManager") PlatformTransactionManager txManager) {
        Tasklet tasklet = (contribution, chunkContext) -> {
            // TODO: replace with translated logic from COBOL program CBSTM03A.
            //       Inputs / outputs / dispositions are documented in the JCL DD list.
            return RepeatStatus.FINISHED;
        };
        return new StepBuilder("step040", jobRepository)
            .tasklet(tasklet, txManager)
            .build();
    }

    /**
     * Execution order across the chain: POSTTRAN -> INTCALC -> CREASTMT.
     * Wire these jobs with a JobLauncher in deployment order — Spring Batch does
     * not chain Jobs natively; an orchestrator (e.g. Spring Cloud Data Flow,
     * Airflow, or a shell driver) invokes them in sequence.
     */
    public java.util.List<String> chainOrder() {
        return java.util.List.of(posttranJob, intcalcJob, creastmtJob);
    }
}
