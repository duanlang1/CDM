package io.cdm.sqlengine;
/**
 * called when all jobs in EngineCxt finished
 * @author wuzhih
 *
 */
public interface AllJobFinishedListener {

	void onAllJobFinished(EngineCtx ctx);
}