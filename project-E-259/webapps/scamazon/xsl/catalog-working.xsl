<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" exclude-result-prefixes="xalan" xmlns:xalan="http://xml.apache.org/xslt" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN" doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd" encoding="UTF-8" indent="yes" method="xml" xalan:indent-amount="4"/>
<xsl:strip-space elements="*"/>

<xsl:variable name = "fullname" >../images/scamazon/images/</xsl:variable>

<xsl:variable name = "ServletBase">"http://localhost:8080/scamazon/servlet/Cart"></xsl:variable>


<xsl:template match="/">
<html lang="en" xml:lang="en">
 
 <head>Catalog Items Information:</head>
   <body>

 
<img src="../images/scamazon.gif" alt="Scamazon.com's logo"/>
 
 <table border="1" cellpadding="2">
 
 <xsl:for-each select="items/item">
   <tr>

 <xsl:variable name="key">
 <xsl:value-of select="@key" />
</xsl:variable>
   <td>
<xsl:value-of select="$key"/>
<xsl:text>&#xA;</xsl:text> 
  <xsl:value-of select="category" />
 </td>
  <td>
  <xsl:value-of select="name" />
  </td>

  <td>
   <xsl:value-of select="description" />
  </td>


<td>
<xsl:variable name="image_id">
  <xsl:value-of select="image" /> 
  </xsl:variable>
<!--a href="file:///c:/apache-tomcat-8.0.17/webapps/scamazon/images/{$image_id}">   </a>-->
 <img src="../images/{$image_id}" width="200px" height="200px" hspace="20" />

</td>

<td>

<xsl:variable name="Mytypes">

 <xsl:value-of select="types/@label" />
</xsl:variable>
 

 <xsl:for-each select="types/type">
 

 <xsl:value-of select="type" />  
 <xsl:value-of select="$Mytypes" />
 <xsl:text>:</xsl:text>
 
<xsl:variable name="MyDescriptor">
 <xsl:value-of select="descriptor" />  
 </xsl:variable>

 <xsl:value-of select="$MyDescriptor" />
 <xsl:text>&#x9;</xsl:text> 
 <xsl:text>price: $</xsl:text> 
 
 <xsl:variable name="MyPrice">
 <xsl:value-of select="price"/>
 </xsl:variable>
   <xsl:value-of select="$MyPrice" />
  
  <xsl:variable name="href">
  <xsl:text>http://localhost:8080/scamazon/servlet/Cart?key=</xsl:text>
  <xsl:value-of select="$key"/>
   <xsl:text>&amp;description=</xsl:text>
   <xsl:value-of select="$MyDescriptor" />
   <xsl:text>&amp;price=</xsl:text>
    <xsl:value-of select="$MyPrice" />
  </xsl:variable>
 <a href="{$href}">Add  to cart</a>

 <br/> 
  </xsl:for-each>


</td>

    </tr>
    </xsl:for-each>
 </table>
 </body>
 </html>
 </xsl:template>
</xsl:stylesheet>

 
