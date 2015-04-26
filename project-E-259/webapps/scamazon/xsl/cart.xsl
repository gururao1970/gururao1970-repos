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

<xsl:param name="labelKey"/>
<xsl:param name="itemDes"/>
<xsl:param name="LabelDes"/>
<xsl:param name="description"/>
<xsl:param name="price"/>
<xsl:param name="quantity"/>

  <xsl:template match="/">
    <html xml:lang="en" lang="en">
      <head>
        <title>Scamazon.com--Earth's Smallest Selection</title>
      </head>
      <body>
       <div align="center">
     <table border="1"  width="700">
    <tr bgcolor="#9acd32">
    
      <th>Item </th>
      <th>Type</th>
      <th>Label Description</th>
      <th> Price  USD</th>
      <th>    Quantity </th>
      <th>  Add More </th>
      <th>  Remove </th>
    </tr>
    <xsl:for-each select="items/item">
    <tr>

   <td  width="100"><xsl:value-of select="$itemDes"/></td>
   <td  width="100"><xsl:value-of select="$LabelDes"/></td>
   <td width="100"><xsl:value-of select="$description"/></td>
   <td  width="100"><xsl:value-of select="$price"/></td>
   <td  width="100"><xsl:value-of select="$quantity"/></td>

   <td  width="100">
  <xsl:variable name="label-action">
  <xsl:text>http://localhost:8080/scamazon/servlet/Cart?labelKey=</xsl:text>
  <xsl:value-of select="$labelKey"/>
  </xsl:variable>
  
  <form>
            <input type="number" name="{$labelKey}" min="0" max="100" step="1" value="0" />
              <input type="submit"  method="get"  action="{$label-action}" />
 </form>
    </td>
    <td  width="100">
   <xsl:variable name="Remove">
  <xsl:text>http://localhost:8080/scamazon/servlet/Cart?Remove=</xsl:text>
   <xsl:value-of select="$labelKey"/>
  </xsl:variable>   
   <a href="{$Remove}">Remove</a>

  </td>
    
    </tr>
    </xsl:for-each>
  </table>                             
       </div>
       
     </body>
   </html>
 </xsl:template>

</xsl:stylesheet>
