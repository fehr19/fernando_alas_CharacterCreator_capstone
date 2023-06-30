package com.perscholas.ancestryBenefit;

import java.util.List;

public interface AncestryBenefitService {

    List<AncestryBenefit> getAllAncestryBenefits();
    public List<String> getAncestryBenefitsById(String ancestryName);
}
