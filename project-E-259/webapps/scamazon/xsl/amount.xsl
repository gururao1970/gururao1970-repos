<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0" exclude-result-prefixes="xalan" xmlns:xalan="http://xml.apache.org/xslt" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <!-- output pretty-printed results as XHTML 1.0 -->
  <xsl:output doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN" doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd" encoding="UTF-8" indent="yes" method="xml" xalan:indent-amount="4"/>

<xsl:param name="Amount"/>

  <xsl:template match="/">
    <html xml:lang="en" lang="en">
     
      <div align="center" style="color:Green">
	<h3> 
	       Total Amount USD:<xsl:value-of select="$Amount"/>
	</h3>

        </div>

    </html>
  </xsl:template>

</xsl:stylesheet>
