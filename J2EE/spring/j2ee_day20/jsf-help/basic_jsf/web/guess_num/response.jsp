<HTML>
    <HEAD> <title>Guess The Number</title> </HEAD>
    <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
    <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
    <body bgcolor="white">
    <f:view>
    <h:form id="responseForm" >
        <h:graphicImage id="waveImg" url="wave.med.gif" alt="Duke waving" />
    <h2><h:outputText id="result" 
    			value="#{guess.response}"/></h2>   
    <h:commandButton id="back" value="Back" action="success"/><p>

    </h:form>
    </f:view>
 </HTML>
