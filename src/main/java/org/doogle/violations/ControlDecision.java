package org.doogle.violations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ControlDecision {

    public String controlDecisionIdentifier;
    public String originationSource;
    public Date creationDate;
    public String state;
    public String group;
    public Date closedDate;

}
