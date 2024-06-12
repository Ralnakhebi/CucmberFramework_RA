package api.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data{
	private int year;
	private Object price;
	@JsonProperty("CPU model")
	private String cPUModel;
	@JsonProperty("Hard disk size")
	private String hardDiskSize;

	public void setYear(int year){
		this.year = year;
	}

	public int getYear(){
		return year;
	}

	public void setPrice(Object price){
		this.price = price;
	}

	public Object getPrice(){
		return price;
	}

	public void setCPUModel(String cPUModel){
		this.cPUModel = cPUModel;
	}

	public String getCPUModel(){
		return cPUModel;
	}

	public void setHardDiskSize(String hardDiskSize){
		this.hardDiskSize = hardDiskSize;
	}

	public String getHardDiskSize(){
		return hardDiskSize;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"year = '" + year + '\'' + 
			",price = '" + price + '\'' + 
			",cPU model = '" + cPUModel + '\'' + 
			",hard disk size = '" + hardDiskSize + '\'' + 
			"}";
		}
}