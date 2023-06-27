package com.perscholas.ancestry;

import com.perscholas.ancestryBenefits.AncestryBenefits;
import com.perscholas.player.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AncestryService {

    int calculateSpeed(Player player);

    List<String> getAncestryBenefitsById(Player player);


}
