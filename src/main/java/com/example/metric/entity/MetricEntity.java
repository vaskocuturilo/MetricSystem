package com.example.metric.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "metric_entity")
@Data
public class MetricEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String metricName;
    private Integer value;

}
