package com.acme.banking.dbo.service;

import com.acme.banking.dbo.domain.Branch;

public class Reporting {
    /**
     * @return Markdown report for all branches, clients, accounts
     */
    public String getReport(Branch rootBranch) {
        if (rootBranch.getAccounts().isEmpty()) {
            return "(no accounts)";
        }
        return rootBranch.toString();
    }
}
