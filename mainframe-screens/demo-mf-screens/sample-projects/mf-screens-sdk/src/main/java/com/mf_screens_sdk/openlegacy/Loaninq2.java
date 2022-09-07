package com.mf_screens_sdk.openlegacy;

import org.openlegacy.core.annotations.screen.Identifier;
import org.openlegacy.core.annotations.screen.ScreenEntity;
import org.openlegacy.core.annotations.screen.ScreenField;
import org.openlegacy.core.annotations.screen.ScreenIdentifiers;
import org.openlegacy.core.annotations.screen.ScreenNavigation;
import org.openlegacy.core.terminal.actions.TerminalActions.F12;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ScreenEntity(rows = 24, columns = 80)
@ScreenIdentifiers(identifiers = { 
                @Identifier(row = 1, column = 2, value = "LOANINQ2                        "), 
                @Identifier(row = 5, column = 2, value = "Loan number. . :"), 
                @Identifier(row = 5, column = 45, value = "Loan A/C number. . :") 
                })
@ScreenNavigation(accessedFrom = Loaninq1.class, exitAction = F12.class, assignedFields = {})
public class Loaninq2 implements org.openlegacy.core.terminal.ScreenEntity {

    @ScreenField(key = true, row = 5, column = 19, endColumn= 28, labelColumn= 2, editable= true, displayName = "Loan number")
    private Integer loanNumber;

    @ScreenField(row = 5, column = 66, endColumn= 75, labelColumn= 45, editable= true, displayName = "Loan A/C number")
    private String loanAcNumber;

    @ScreenField(row = 7, column = 19, endColumn= 28, labelColumn= 2, editable= true, displayName = "Precloser No")
    private String precloserNo;

    @ScreenField(row = 7, column = 66, endColumn= 75, labelColumn= 45, editable= true, displayName = "Precloser Date")
    private String precloserDate;

    @ScreenField(row = 9, column = 19, endColumn= 28, labelColumn= 2, editable= true, displayName = "Appl Date")
    private String applDate;

    @ScreenField(row = 9, column = 66, endColumn= 79, labelColumn= 45, editable= true, displayName = "Applicant Name")
    private String applicantName;

    @ScreenField(row = 11, column = 19, endColumn= 28, labelColumn= 2, editable= true, displayName = "Loan Amount")
    private Double loanAmount;

    @ScreenField(row = 11, column = 66, endColumn= 79, labelColumn= 45, editable= true, displayName = "Loan Term")
    private Integer loanTerm;

    @ScreenField(row = 13, column = 19, endColumn= 28, labelColumn= 2, editable= true, displayName = "Prncpl Balance")
    private Double prncplBalance;

    @ScreenField(row = 13, column = 66, endColumn= 79, labelColumn= 45, editable= true, displayName = "Interest Rate")
    private Double interestRate;

    @ScreenField(row = 15, column = 19, endColumn= 28, labelColumn= 2, editable= true, displayName = "Monthly EMI")
    private Double monthlyEmi;

    @ScreenField(row = 15, column = 66, endColumn= 79, labelColumn= 45, editable= true, displayName = "Penalty Amount")
    private String penaltyAmount;

    @ScreenField(row = 17, column = 19, endColumn= 28, labelColumn= 2, editable= true, displayName = "Loan Start Date")
    private String loanStartDate;

    @ScreenField(row = 17, column = 66, endColumn= 79, labelColumn= 45, editable= true, displayName = "Loan Close Date")
    private String loanCloseDate;

    @ScreenField(row = 19, column = 19, endColumn= 28, labelColumn= 2, editable= true, displayName = "Preclosere Amnt")
    private String preclosereAmnt;

    @ScreenField(row = 19, column = 66, endColumn= 79, labelColumn= 45, editable= true, displayName = "Cash/Cheque DD")
    private String cashchequeDd;

    @ScreenField(row = 21, column = 19, endColumn= 28, labelColumn= 2, editable= true, displayName = "Cheque DD No")
    private String chequeDdNo;

    @ScreenField(row = 21, column = 66, endColumn= 79, labelColumn= 45, editable= true, displayName = "Cheque DD Date")
    private String chequeDdDate;
    
    private String focusField;
}
