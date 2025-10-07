# PROBLEM3_CARLSON
Product Customization and External Integration System HW1 Problem

## RESOURCES
- https://stackoverflow.com/questions/2538787/how-to-print-a-float-with-2-decimal-places-in-java
- https://stackoverflow.com/questions/73325162/why-do-setter-methods-in-the-builder-design-pattern-return-this
- https://www.youtube.com/watch?v=-Aud0cDh-J8&t=639s
- https://www.youtube.com/watch?v=zKDmzKaAQro
- Adapter slides
- Week5Adapter example code

## EXPLANATION OF DESIGN CHOICES
- **Adapter** was used in order to adapt CSV data to an ArrayList of String arrays to work with internal product representation. Using an interface for External Data would allow for future implementations of other external data styles (i.e. could implement a TXTDataAdapter using the ExternalDataAdapter interface in order to make .txt files work with internal product representation).
- **Builder** was used to build the tech products because we wanted to be able to have customizable products. This required customizing each step required in the product building process which works best implemented using the builder pattern. 
