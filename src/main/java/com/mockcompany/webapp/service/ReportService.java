package com.mockcompany.webapp.service;

import com.mockcompany.webapp.api.SearchReportResponse;
import com.mockcompany.webapp.model.ProductItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public interface ReportService {
    public SearchReportResponse runReport();
}

@Service
class ReportServiceImple implements ReportService {

    private final EntityManager entityManager;

    @Autowired
    public ReportServiceImple(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public SearchReportResponse runReport() {
        // Simulate failure to break the code for CI testing
        // Option 1: Return empty response (Breaking the functionality)
        SearchReportResponse response = new SearchReportResponse();
        response.setSearchTermHits(new HashMap<>()); // Empty hits to simulate failure
        response.setProductCount(0); // Simulate no products found
        return response;

        // Option 2: Throw a runtime exception to break the code
        // Uncomment the below line to throw an error and break the functionality.
        // throw new RuntimeException("Breaking the code to test CI failure");

        // Option 3: Intentionally returning incorrect or empty data
        // If you'd prefer to simulate a failure with incorrect data, use the following lines:
        /*
        response.setSearchTermHits(new HashMap<>());
        response.setProductCount(-1); // Invalid product count to simulate error
        return response;
        */
    }
}
