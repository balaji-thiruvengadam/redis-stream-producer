/**
 * 
 */
package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author balaj
 *
 */

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Product {

 private String name;
    private double price;
    private Category category;
}
