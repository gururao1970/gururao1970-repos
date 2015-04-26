<?xml version="1.0" encoding="UTF-8"?>

<!-- Any references to the local filesystem in XSLT instructions are resolved
     with respect to project4-8.0/webapps/scamazon/.

     For instance, to access the contents of
     project4-8.0/webapps/scamazon/xml/foo.xml, you 
     could use:

       xsl:variable name="root" select="document('xml/foo.xml')" 

     To include project4-8.0/webapps/scamazon/xsl/bar.xsl, you 
     could use:

       xsl:include href="xsl/bar.xsl"

     To import project4-8.0/webapps/scamazon/xsl/baz.xsl, you
     could use:

       xsl:import href="xsl/baz.xsl"

     However, any references to the local filesystem in XHTML are resolved
     with respect to project4-8.0/webapps/scamazon/xsl/.

     For instance, to reference project4-8.0/webapps/scamazon/images/qux.gif,
     you could use:

       img src="../images/qux.gif"
-->

<!-- XSLT stylesheet for displaying contents of user's shopping cart -->
<xsl:stylesheet version="1.0" exclude-result-prefixes="xalan" xmlns:xalan="http://xml.apache.org/xslt" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <!-- output pretty-printed results as XHTML 1.0 -->
  <xsl:output doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN" doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd" encoding="UTF-8" indent="yes" method="xml" xalan:indent-amount="4"/>

  <xsl:template match="/">
    <html xml:lang="en" lang="en">
      <head>
        <title>Scamazon.com--Earth's Smallest Selection</title>
      </head>
      <body>
      <div style='float: right;'><a href="http://localhost:8080/scamazon/servlet/Catalog">Show  Catalog</a></div>
      
       <div style='float: left;'><a href="http://localhost:8080/scamazon/servlet/Cart?CheckOut=checkout">Checkout</a></div>

        <div align="center">

          <!-- Scamazon.com's logo -->
          <img alt="Scamazon.com's logo" src="../images/scamazon.gif" />
          <br /><br />

            <h1>My CheckOut Collection</h1>

          <!-- TODO -->
                   
       </div>
     </body>
   </html>
 </xsl:template>

</xsl:stylesheet>
