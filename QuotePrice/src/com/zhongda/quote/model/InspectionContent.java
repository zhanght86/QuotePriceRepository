package com.zhongda.quote.model;

public class InspectionContent {
    private Integer id;

    private Integer sourceId;

    private String inspectionContentName;

    private Integer sampleQuantity;

    private String sampleQuantityRange;

    private Integer sampleBasisId;

    private Integer singleObjectQuantity;

    private String singleQuantityRange;

    private String chargeUnit;

    private Integer chargeStandard;

    private String chargeStandardUnit;

    private Integer quoteBasisId;

    private Integer batchId;

    private Double inspectionContentAmount;
    
    private Object[] objects;
    
    public InspectionContent(){
    	
    }

    public InspectionContent(String inspectionContentName, Integer sampleQuantity,
    		Integer singleObjectQuantity, Integer chargeStandard) {
		this.inspectionContentName = inspectionContentName;
		this.sampleQuantity = sampleQuantity;
		this.singleObjectQuantity = singleObjectQuantity;
		this.chargeStandard = chargeStandard;
	}
    
    public InspectionContent(Object[] objects){
    	this.objects = objects;
    	 inspectionContentName = (String) objects[0];
    	 sampleBasisId = (Integer) objects[1];
    	 sampleQuantityRange = (String) objects[2];
    	 sampleQuantity = (Integer) objects[3];
    	 quoteBasisId = (Integer) objects[4];
    	 singleQuantityRange = (String) objects[5];
    	 singleObjectQuantity = (Integer) objects[6];
    	 chargeUnit = (String) objects[7];
    	 chargeStandard = (Integer) objects[8];
    	
    	
    }

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public String getInspectionContentName() {
        return inspectionContentName;
    }

    public void setInspectionContentName(String inspectionContentName) {
        this.inspectionContentName = inspectionContentName == null ? null : inspectionContentName.trim();
    }

    public Integer getSampleQuantity() {
        return sampleQuantity;
    }

    public void setSampleQuantity(Integer sampleQuantity) {
        this.sampleQuantity = sampleQuantity;
    }

    public String getSampleQuantityRange() {
        return sampleQuantityRange;
    }

    public void setSampleQuantityRange(String sampleQuantityRange) {
        this.sampleQuantityRange = sampleQuantityRange == null ? null : sampleQuantityRange.trim();
    }

    public Integer getSampleBasisId() {
        return sampleBasisId;
    }

    public void setSampleBasisId(Integer sampleBasisId) {
        this.sampleBasisId = sampleBasisId;
    }

    public Integer getSingleObjectQuantity() {
        return singleObjectQuantity;
    }

    public void setSingleObjectQuantity(Integer singleObjectQuantity) {
        this.singleObjectQuantity = singleObjectQuantity;
    }

    public String getSingleQuantityRange() {
        return singleQuantityRange;
    }

    public void setSingleQuantityRange(String singleQuantityRange) {
        this.singleQuantityRange = singleQuantityRange == null ? null : singleQuantityRange.trim();
    }

    public String getChargeUnit() {
        return chargeUnit;
    }

    public void setChargeUnit(String chargeUnit) {
        this.chargeUnit = chargeUnit == null ? null : chargeUnit.trim();
    }

    public Integer getChargeStandard() {
        return chargeStandard;
    }

    public void setChargeStandard(Integer chargeStandard) {
        this.chargeStandard = chargeStandard;
    }

    public String getChargeStandardUnit() {
        return chargeStandardUnit;
    }

    public void setChargeStandardUnit(String chargeStandardUnit) {
        this.chargeStandardUnit = chargeStandardUnit == null ? null : chargeStandardUnit.trim();
    }

    public Integer getQuoteBasisId() {
        return quoteBasisId;
    }

    public void setQuoteBasisId(Integer quoteBasisId) {
        this.quoteBasisId = quoteBasisId;
    }

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public Double getInspectionContentAmount() {
        return inspectionContentAmount;
    }

    public void setInspectionContentAmount(Double inspectionContentAmount) {
        this.inspectionContentAmount = inspectionContentAmount;
    }
}