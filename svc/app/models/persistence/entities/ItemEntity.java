package models.persistence.entities;

import javax.persistence.*;

/**
 * Created by a613651 on 18/01/2016.
 */

@Table(name = "item")
@Entity
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;
}