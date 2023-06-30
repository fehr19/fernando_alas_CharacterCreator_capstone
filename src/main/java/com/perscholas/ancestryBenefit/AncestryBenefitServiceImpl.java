package com.perscholas.ancestryBenefit;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AncestryBenefitServiceImpl implements AncestryBenefitService{


    private final AncestryBenefitRepository ancestryBenefitRepository;

    public AncestryBenefitServiceImpl(AncestryBenefitRepository ancestryBenefitRepository) {
        this.ancestryBenefitRepository = ancestryBenefitRepository;
    }
    // This method should return a row from the Abilities table that matches
    // the id of the chose ancestry and then display the 11 options in a
    // table.

    @Override
    public List<AncestryBenefit> getAllAncestryBenefits() {
        return ancestryBenefitRepository.findAll();
    }

    public List<String> getAncestryBenefitsById(String ancestryName) {


        return null;
    }
}
