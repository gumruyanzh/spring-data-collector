package com.col.data.repository;

import com.col.data.entity.DataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhirayrg on 5/2/2017.
 */
public interface DataRepository extends JpaRepository<DataEntity, Long> {
}
