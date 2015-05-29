package piedatasource;

import oracle.adf.model.adapter.bean.annotation.Id;

public class Data {
    
    private int value;
    @Id
    private String name;
    
    public Data() {
        super();
    }
    
    public Data(String s, int i) {
        super();
        this.value = i;
        this.name = s;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
