package Project_6_ExceptionHandling_FilesTextIO_JeffreyCabrera2.src.chapter12.exceptions.person.field;
//Import necessary packages
import Project_6_ExceptionHandling_FilesTextIO_JeffreyCabrera2.src.chapter12.exceptions.person.PersonValidationException;

/**
* This class represents a custom exception for street validation errors.
* It extends the PersonValidationException class.
*/
public class StreetValidationException extends PersonValidationException {

 // Serial version UID for serialization purposes
 private static final long serialVersionUID = 1L;

 /**
  * Constructor to create a StreetValidationException with a custom error message.
  * @param message The error message for the exception.
  */
 public StreetValidationException(String message) {
     // Call the constructor of the superclass (PersonValidationException) with the provided message
     super(message);
 }
}