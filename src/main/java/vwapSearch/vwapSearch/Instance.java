package vwapSearch.vwapSearch;

import java.util.Date;

import lombok.Data;

@Data
public class Instance {

    private float vwap;
    
    private float ltp;
    
    private String underlying;
    
    private Date date;
    
}
