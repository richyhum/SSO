<jsp:directive.include file="includes/top.jsp" />


<div id="cookiesDisabled"  class="errors"  style="display:none;">

   <h2><spring:message code="screen.cookies.disabled.title"/></h2>

   <p><spring:message  code="screen.cookies.disabled.message"/></p>

</div>


<c:if  test="${not empty registeredService}">

   <c:set var="registeredServiceLogo" value="images/webapp.png"/>

   <c:set var="registeredServiceName" value="${registeredService.name}"/>

   <c:set var="registeredServiceDescription" value="${registeredService.description}"/>

   <c:choose>

        <c:when test="${not empty mduiContext}">

            <c:if  test="${not empty mduiContext.logoUrl}">

                <c:set  var="registeredServiceLogo" value="${mduiContext.logoUrl}"/>

            </c:if>

            <c:set var="registeredServiceName" value="${mduiContext.displayName}"/>

            <c:set var="registeredServiceDescription" value="${mduiContext.description}"/>

        </c:when>

        <c:when test="${not empty registeredService.logo}">

            <c:set var="registeredServiceLogo" value="${registeredService.logo}"/>

        </c:when>

   </c:choose>

   <p/>

</c:if>


<div class="box" id="login">

   <form:form  method="post" id="fm1" commandName="${commandName}"  htmlEscape="true">

		<!-- 存放要访问的service -->
		<input type="hidden" id="csa_server_url" name="csa_server_url"/> 
		
        <form:errors path="*"  id="msg"  cssClass="errors"  element="div"  htmlEscape="false"/>

        <h2><spring:message code="screen.welcome.instructions"/></h2>

        <section class="row">

            <label for="username"><spring:message code="screen.welcome.label.netid"/></label>

            <c:choose>

                <c:when  test="${not empty sessionScope.openIdLocalId}">

                    <strong><c:out value="${sessionScope.openIdLocalId}"/></strong>

                    <input  type="hidden" id="username"  name="username"  value="<c:out  value="${sessionScope.openIdLocalId}"/>"/>

                </c:when>

                <c:otherwise>

                    <spring:message  code="screen.welcome.label.netid.accesskey"  var="userNameAccessKey"/>

                    <form:input cssClass="required"   cssErrorClass="error" id="username"  size="25"  tabindex="1"  accesskey="${userNameAccessKey}"   path="username"   autocomplete="off"  htmlEscape="true"/>

                </c:otherwise>

            </c:choose>

        </section>

        <section  class="row">

            <label for="password"><spring:message  code="screen.welcome.label.password"/></label>

            <spring:message  code="screen.welcome.label.password.accesskey"  var="passwordAccessKey"/>

            <form:password cssClass="required"  cssErrorClass="error"  id="password" size="25"  tabindex="2" path="password"  accesskey="${passwordAccessKey}"  htmlEscape="true" autocomplete="off"/>

            <span  id="capslock-on"  style="display:none;"><p><img src="images/warning.png"  valign="top"><spring:message code="screen.capslock.on"/></p></span>

        </section>

        <section class="rowbtn-row">
          
          	<input type="hidden" name="execution"  value="${flowExecutionKey}"/>

            <input  type="hidden"  name="_eventId"  value="submit"/>
 
            <input class="btn-submit"  name="submit"  accesskey="l"  value="<spring:message  code="screen.welcome.button.login"/>"   tabindex="6"    
            	type="submit" onsubmit="return loginSys()"/>

            <input class="btn-reset"  name="reset"  accesskey="c"  value="<spring:message code="screen.welcome.button.clear"/>"  tabindex="7"   type="reset"/>

        </section>

   </form:form>

</div>


<script type="text/javascript">
<!--

//-->
function loginSys() {
	document.getElementById("csa_server_url").value = document.URL;
	document.getElementById("fm1").action = "http://localhost:8081/cas-client01/test";
	return true;
}
</script>
<jsp:directive.include file="includes/bottom.jsp" />
