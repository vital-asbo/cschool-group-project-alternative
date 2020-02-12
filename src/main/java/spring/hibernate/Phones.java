package spring.hibernate;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Phones")
@Data
@RequiredArgsConstructor
public class Phones{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "employees_id", nullable = false, referencedColumnName="id")
    @NonNull
    public Employees employees;

    @Column(name = "name")
    @NonNull
    private String name;

    @Column(name = "model")
    @NonNull
    private String model;

    public Phones(){};
}

