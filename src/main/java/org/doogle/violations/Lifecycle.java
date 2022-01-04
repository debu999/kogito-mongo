package org.doogle.violations;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RegisterForReflection
public class Lifecycle {
    public String lifecycleIdentifier;
    public String lifecycleType;
    public String subject;
    public String lineOfBusiness;
    public String businessDate;
    public Date createDate;
}
