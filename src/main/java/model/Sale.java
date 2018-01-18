package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<SalesLineItem> lineItems;
    private LocalDateTime date;
    private boolean isComplete;

    public Sale() {
        lineItems = new ArrayList<SalesLineItem>();
        date = LocalDateTime.now();
        isComplete = false;
    }

}
