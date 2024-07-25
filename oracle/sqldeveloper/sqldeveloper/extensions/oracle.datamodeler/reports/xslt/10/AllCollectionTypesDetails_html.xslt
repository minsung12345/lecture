<?xml version="1.0" encoding="UTF-8"?><!--Designed and generated by Altova StyleVision Enterprise Edition 2014 (x64) - see http://www.altova.com/stylevision for more information.--><xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:altova="http://www.altova.com" xmlns:altovaext="http://www.altova.com/xslt-extensions" xmlns:clitype="clitype" xmlns:fn="http://www.w3.org/2005/xpath-functions" xmlns:iso4217="http://www.xbrl.org/2003/iso4217" xmlns:ix="http://www.xbrl.org/2008/inlineXBRL" xmlns:java="java" xmlns:link="http://www.xbrl.org/2003/linkbase" xmlns:n1="http://oracle.com/datamodeler/reports/collectiontypes" xmlns:sps="http://www.altova.com/StyleVision/user-xpath-functions" xmlns:xbrldi="http://xbrl.org/2006/xbrldi" xmlns:xbrli="http://www.xbrl.org/2003/instance" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" exclude-result-prefixes="altova altovaext clitype fn iso4217 ix java link n1 sps xbrldi xbrli xlink xs xsd xsi">	<xsl:output version="4.0" method="html" indent="no" encoding="UTF-8" doctype-public="-//W3C//DTD HTML 4.01 Transitional//EN" doctype-system="http://www.w3.org/TR/html4/loose.dtd"/>	<xsl:param name="SV_OutputFormat" select="'HTML'"/>	<xsl:param name="p1"/>	<xsl:param name="p2"/>	<xsl:variable name="XML" select="/"/>	<xsl:variable name="altova:nPxPerIn" select="96"/>	<xsl:template match="/">		<html>			<head>				<title/>				<meta name="generator" content="Altova StyleVision Enterprise Edition 2014 (x64) (http://www.altova.com)"/>				<meta http-equiv="X-UA-Compatible" content="IE=7"/>				<xsl:value-of select="normalize-space(concat('&lt;link rel=&quot;stylesheet&quot; type=&quot;text/css&quot; href=&quot;', $p1, '&quot;>'))" disable-output-escaping="yes"/>                <xsl:value-of select="normalize-space(concat('&lt;link rel=&quot;stylesheet&quot; type=&quot;text/css&quot; href=&quot;', $p2, '&quot;>'))" disable-output-escaping="yes"/>				<xsl:comment>[if IE]&gt;&lt;STYLE type=&quot;text/css&quot;&gt;.altova-rotate-left-textbox{filter: progid:DXImageTransform.Microsoft.BasicImage(rotation=3)} .altova-rotate-right-textbox{filter: progid:DXImageTransform.Microsoft.BasicImage(rotation=1)} &lt;/STYLE&gt;&lt;![endif]</xsl:comment>				<xsl:comment>[if !IE]&gt;&lt;!</xsl:comment>				<style type="text/css">.altova-rotate-left-textbox{-webkit-transform: rotate(-90deg) translate(-100%, 0%); -webkit-transform-origin: 0% 0%;-moz-transform: rotate(-90deg) translate(-100%, 0%); -moz-transform-origin: 0% 0%;-ms-transform: rotate(-90deg) translate(-100%, 0%); -ms-transform-origin: 0% 0%;}.altova-rotate-right-textbox{-webkit-transform: rotate(90deg) translate(0%, -100%); -webkit-transform-origin: 0% 0%;-moz-transform: rotate(90deg) translate(0%, -100%); -moz-transform-origin: 0% 0%;-ms-transform: rotate(90deg) translate(0%, -100%); -ms-transform-origin: 0% 0%;}</style>				<xsl:comment>&lt;![endif]</xsl:comment>				<style type="text/css">@page { margin-left:2cm; margin-right:2cm; margin-top:2cm; margin-bottom:2cm } @media print { br.altova-page-break { page-break-before: always; } }</style>			</head>			<body style="font-family:Tahoma; font-size:xx-small; ">				<xsl:for-each select="$XML">					<xsl:for-each select="n1:CollectionTypes">						<center>							<xsl:for-each select="n1:ReportCaption">								<span class="caption">									<xsl:apply-templates/>								</span>							</xsl:for-each>						</center>						<p/>						<table class="w_20">							<xsl:variable name="altova:CurrContextGrid_0" select="."/>							<tbody>								<tr>									<td class="td_h_v w_4">										<span>											<xsl:text>Design Name</xsl:text>										</span>									</td>									<td class="td w_16">										<xsl:for-each select="n1:DesignName">											<xsl:apply-templates/>										</xsl:for-each>									</td>								</tr>								<tr>									<td class="td_h_v">										<span>											<xsl:text>Version Date</xsl:text>										</span>									</td>									<td class="td">										<xsl:for-each select="n1:VersionDate">											<xsl:apply-templates/>										</xsl:for-each>									</td>								</tr>								<tr>									<td class="td_h_v">										<span>											<xsl:text>Version Comment</xsl:text>										</span>									</td>									<td class="td">										<xsl:for-each select="n1:VersionComment">											<xsl:apply-templates/>										</xsl:for-each>									</td>								</tr>								<tr>									<td class="td_h_v">										<span>											<xsl:text>Model Name</xsl:text>										</span>									</td>									<td class="td">										<xsl:for-each select="n1:ModelName">											<xsl:apply-templates/>										</xsl:for-each>									</td>								</tr>							</tbody>						</table>						<xsl:for-each select="n1:CTCollection">							<xsl:for-each select="n1:CTDetails">								<xsl:variable name="v_ShortObjectID" select="n1:EncodedName"/>								<xsl:variable name="v_ObjectName" select="n1:CTName"/>								<xsl:variable name="v_DiagramSuffix" select="&apos;&apos;"/>								<xsl:if test="../../n1:UsePageBreaks = &apos;true&apos;">									<br class="altova-page-break" clear="all"/>								</xsl:if>								<p/>								<table class="w_16">									<xsl:variable name="altova:CurrContextGrid_1" select="."/>									<tbody>										<tr>											<td class="td_h_v w_4">												<span>													<xsl:text>Collection Type Name</xsl:text>												</span>											</td>											<td class="td obj_name w_12">												<xsl:choose>													<xsl:when test="$SV_OutputFormat = &apos;HTML&apos;">														<xsl:element name="a">															<xsl:attribute name="id">																<xsl:value-of select="$v_ShortObjectID"/>															</xsl:attribute>															<span>																<xsl:value-of select="$v_ObjectName"/>															</span>														</xsl:element>													</xsl:when>													<xsl:when test="$SV_OutputFormat = &apos;PDF&apos;">														<a>															<xsl:attribute name="name">																<xsl:value-of select="$v_ShortObjectID"/>															</xsl:attribute>															<span>																<xsl:value-of select="$v_ObjectName"/>															</span>														</a>													</xsl:when>													<xsl:when test="$SV_OutputFormat = &apos;RTF&apos;">														<h3>															<span>																<xsl:value-of select="$v_ObjectName"/>															</span>														</h3>													</xsl:when>												</xsl:choose>											</td>										</tr>										<tr>											<td class="td_h_v">												<span>													<xsl:text>Type</xsl:text>												</span>											</td>											<td class="td">												<xsl:for-each select="n1:CTType">													<xsl:apply-templates/>												</xsl:for-each>											</td>										</tr>										<tr>											<td class="td_h_v">												<span>													<xsl:text>Max Elements</xsl:text>												</span>											</td>											<td class="td">												<xsl:for-each select="n1:CTMaxElements">													<xsl:apply-templates/>												</xsl:for-each>											</td>										</tr>										<tr>											<td class="td_h_v">												<span>													<xsl:text>Data Type</xsl:text>												</span>											</td>											<td class="td">												<xsl:for-each select="n1:CTDataType">													<xsl:apply-templates/>												</xsl:for-each>											</td>										</tr>										<tr>											<td class="td_h_v">												<span>													<xsl:text>Data Type Kind</xsl:text>												</span>											</td>											<td class="td">												<xsl:for-each select="n1:CTDataTypeKind">													<xsl:apply-templates/>												</xsl:for-each>											</td>										</tr>										<tr>											<td class="td_h_v">												<span>													<xsl:text>Domain Name</xsl:text>												</span>											</td>											<td class="td">												<xsl:for-each select="n1:CTDomainName">													<xsl:apply-templates/>												</xsl:for-each>											</td>										</tr>									</tbody>								</table>								<xsl:if test="count( n1:DescriptionNotes )">									<p/>									<xsl:for-each select="n1:DescriptionNotes">										<table class="w_16">											<xsl:variable name="altova:CurrContextGrid_2" select="."/>											<tbody>												<tr>													<td class="td_h_v w_4">														<span>															<xsl:text>Description</xsl:text>														</span>													</td>													<td class="td w_12">														<xsl:for-each select="n1:Description">															<xsl:apply-templates/>														</xsl:for-each>													</td>												</tr>												<tr>													<td class="td_h_v">														<span>															<xsl:text>Notes</xsl:text>														</span>													</td>													<td class="td">														<xsl:for-each select="n1:Notes">															<xsl:apply-templates/>														</xsl:for-each>													</td>												</tr>											</tbody>										</table>									</xsl:for-each>								</xsl:if>								<xsl:if test="count( n1:TablesCollection )">									<p/>									<span class="t_cap">										<xsl:text>Used In Tables</xsl:text>									</span>									<br/>									<table class="w_25">										<xsl:variable name="altova:CurrContextGrid_3" select="."/>										<thead>											<tr>												<th class="td_h_h w_8">													<span>														<xsl:text>Model Name</xsl:text>													</span>												</th>												<th class="td_h_h w_8p5">													<span>														<xsl:text>Table Name</xsl:text>													</span>												</th>												<th class="td_h_h w_8p5">													<span>														<xsl:text>Column Name</xsl:text>													</span>												</th>											</tr>										</thead>										<tbody>											<xsl:for-each select="n1:TablesCollection">												<xsl:for-each select="n1:TableDetails">													<tr>														<td class="td">															<xsl:for-each select="n1:ModelName">																<xsl:apply-templates/>															</xsl:for-each>														</td>														<td class="td">															<xsl:for-each select="n1:TableName">																<xsl:apply-templates/>															</xsl:for-each>														</td>														<td class="td">															<xsl:for-each select="n1:ColumnName">																<xsl:apply-templates/>															</xsl:for-each>														</td>													</tr>												</xsl:for-each>											</xsl:for-each>										</tbody>									</table>								</xsl:if>								<xsl:if test="count( n1:EntitiesCollection )">									<p/>									<span class="t_cap">										<xsl:text>Used In Entities</xsl:text>									</span>									<table class="w_25">										<xsl:variable name="altova:CurrContextGrid_4" select="."/>										<thead>											<tr>												<th class="td_h_h w_12p5">													<span>														<xsl:text>Entity Name</xsl:text>													</span>												</th>												<th class="td_h_h w_12p5">													<span>														<xsl:text>Attribute Name</xsl:text>													</span>												</th>											</tr>										</thead>										<tbody>											<xsl:for-each select="n1:EntitiesCollection">												<xsl:for-each select="n1:EntityDetails">													<tr>														<td class="td">															<xsl:for-each select="n1:EntityName">																<xsl:apply-templates/>															</xsl:for-each>														</td>														<td class="td">															<xsl:for-each select="n1:AttributeName">																<xsl:apply-templates/>															</xsl:for-each>														</td>													</tr>												</xsl:for-each>											</xsl:for-each>										</tbody>									</table>								</xsl:if>								<xsl:if test="count( n1:STCollection )">									<p/>									<span class="t_cap">										<xsl:text>Used In Structured Types</xsl:text>									</span>									<table class="w_25">										<xsl:variable name="altova:CurrContextGrid_5" select="."/>										<thead>											<tr>												<th class="td_h_h w_12p5">													<span>														<xsl:text>Structured Type Name</xsl:text>													</span>												</th>												<th class="td_h_h w_12p5">													<span>														<xsl:text>Attribute Name</xsl:text>													</span>												</th>											</tr>										</thead>										<tbody>											<xsl:for-each select="n1:STCollection">												<xsl:for-each select="n1:STDetails">													<tr>														<td class="td">															<xsl:for-each select="n1:STName">																<xsl:apply-templates/>															</xsl:for-each>														</td>														<td class="td">															<xsl:for-each select="n1:AttributeName">																<xsl:apply-templates/>															</xsl:for-each>														</td>													</tr>												</xsl:for-each>											</xsl:for-each>										</tbody>									</table>								</xsl:if>							</xsl:for-each>						</xsl:for-each>					</xsl:for-each>				</xsl:for-each>			</body>		</html>	</xsl:template></xsl:stylesheet>