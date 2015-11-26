Sample case of error getting omitted when com.sun.xml.bind.v2.runtime.unmarshaller.UnmarshallingContext#errorsCounter is exceeded
==========================================================

Based on original cxf sample “wsdl_first_xmlbeans”

Building and running the demo using Maven
---------------------------------------

From the base directory of this sample (i.e., where this README file is
located), the pom.xml file is used to build and run the demo. 

Using either UNIX or Windows:

  mvn install   (builds the demo)
  mvn -Pserver  (from one command line window)
  mvn -Pclient  (from a second command line window)

To remove the code generated from the WSDL file and the .class
files, run "mvn clean".

