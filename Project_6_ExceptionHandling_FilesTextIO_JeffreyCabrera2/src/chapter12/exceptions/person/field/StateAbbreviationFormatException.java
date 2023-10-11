package Project_6_ExceptionHandling_FilesTextIO_JeffreyCabrera2.src..exceptions.person.field;
//Import necessary packages
import Project_6_ExceptionHandling_FilesTextIO_JeffreyCabrera2.src..exceptions.person.PersonValidationException;

/**
* This class represents a custom exception for state abbreviation format errors.
* It extends the PersonValidationException class.
*/
public class StateAbbreviationFormatException extends PersonValidationException {

 // Serial version UID for serialization purposes
 private static final long serialVersionUID = 1L;

 /**
  * Constructor to create a StateAbbreviationFormatException with a custom error message.
  * @param message The error message for the exception.
  */
 public StateAbbreviationFormatException(String message) {
     // Call the constructor of the superclass (PersonValidationException) with the provided message
     super(message);
 }
}