package com.zhongda.quote.model;

public class InspectionBatch {
    private Integer id;

	private String inspectionBatchName;

	private Integer projectId;

	private Double inspectionBatchAmount;

	public InspectionBatch() {
	}

	public InspectionBatch(Integer batchId, double batchAmount) {
		this.id = batchId;
		this.inspectionBatchAmount = batchAmount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getInspectionBatchName() {
		return inspectionBatchName;
	}

	public void setInspectionBatchName(String inspectionBatchName) {
		this.inspectionBatchName = inspectionBatchName == null ? null
				: inspectionBatchName.trim();
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public Double getInspectionBatchAmount() {
		return inspectionBatchAmount;
	}

	public void setInspectionBatchAmount(Double inspectionBatchAmount) {
		this.inspectionBatchAmount = inspectionBatchAmount;
	}

}