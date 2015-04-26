<?xml version="1.0" encoding="UTF-8"?>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%-- direct Xalan's environment to browser instead of console --%>
<% java.io.ByteArrayOutputStream os = new java.io.ByteArrayOutputStream(); %>
<% java.io.PrintWriter pw = new java.io.PrintWriter(os); %>
<% (new org.apache.xalan.xslt.EnvironmentCheck()).checkEnvironment(pw); %>

<html xmlns="http://www.w3.org/1999/xhtml" lang="en" xml:lang="en">
  <head>
    <title>Environment Happiness Page</title>
  </head>
  <body>
    <pre>
<% out.print(os); %>
    </pre>
  </body>
</html>
