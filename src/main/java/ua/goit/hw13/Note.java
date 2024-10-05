package ua.goit.hw13;

import lombok.Data;

@Data
//@Entity
public class Note {
//  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String title;
  private String content;
}
