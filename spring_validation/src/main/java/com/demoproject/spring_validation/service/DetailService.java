
package com.sample.validation.service;
import com.sample.validation.model.Details;
import com.sample.validation.repository.DetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class Details_Service {
    @Autowired
    DetailsRepository detailsRepository;
    public List<Details> getALlDetails() {
        List<Details> Details1 = new ArrayList<>();
        detailsRepository.findAll().forEach(details1 -> Details1.add(details1));
        return Details1;
    }
    public void SaveOrUpdate(Details details,Long id)
    {
        detailsRepository.save(details);
    }
}