package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {

	private Integer avgSwimDepth;
	private WaterType waterType;

	public Aquatic(int nrOfLegs, String name, Integer avgSwimDepth, WaterType waterType, Double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
		this.avgSwimDepth = avgSwimDepth;
		this.waterType = waterType;
	}

	public Aquatic(Double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}

	public Integer getAvgSwimDepth() {
		return avgSwimDepth;
	}

	public void setAvgSwimDepth(Integer avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}

	public WaterType getWaterType() {
		return waterType;
	}

	public void setWaterType(WaterType waterType) {
		this.waterType = waterType;
	}

}
