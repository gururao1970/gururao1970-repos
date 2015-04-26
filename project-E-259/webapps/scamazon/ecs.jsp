<?xml version="1.0" encoding="UTF-8"?>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%-- =======================================================================
     Demonstration of Amazon's ECS for Project 4, version 8.0
     Computer Science E-259
======================================================================= --%>

<%@ page language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
  <head>
    <title>Books</title>
  </head>
  <body>
      <c:forEach var="item" items='${requestScope.items}'>
          <c:out value="${item.itemAttributes.title}" />
          <br />
          <c:out value="${item.itemAttributes.author[0]}"/>
          <br />
          <c:out value="${item.itemAttributes.publisher}"/>,
          <c:out value="${item.itemAttributes.publicationDate}"/>
          <br />
          <c:out value="${item.itemAttributes.ISBN}"/>
          <br />
          <br />
          Reviews
          <br />
          <ul>
              <c:forEach var="review" items="${item.customerReviews.review}">
                  <li>
                      (<c:out value="${review.rating}"/>)
                      <c:out value="${review.summary}"/>
                  </li>
              </c:forEach>
          </ul>
          <br />
          <hr />
          <br />
      </c:forEach>
  </body>
</html>
