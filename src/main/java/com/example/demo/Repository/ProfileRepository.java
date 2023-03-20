package com.example.demo.Repository;



import com.example.demo.Entities.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface ProfileRepository extends CrudRepository <Profile,Long>{

}
