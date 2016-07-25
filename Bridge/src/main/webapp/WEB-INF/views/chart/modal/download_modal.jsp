<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

  <div class="modal-content">
          <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
        <h4 class="modal-title custom_align" id="Heading">다운로드</h4>
      </div>
          <div class="modal-body">
          	<br/>
          	여러곡
          	<c:if test="${music!=null}">
			${music.musicSubject}&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;${music.artistName}<br/><br/><hr/><br/>
			 
			다운 곡 수 : 1곡&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1곡 당 금액 : 700원<br/><br/>
			
			<c:set var="href" value="/download_music?musicnumber=${music.musicNumber}"/>
			</c:if>
			<c:if test="${playlistAll!=null}">
				${playlistAll(0)}
			</c:if>
		</div><div class="modal-footer">
        <a href="${href}" type="button" class="btn btn-success" ><span class="glyphicon glyphicon-ok-sign"></span>다운로드</a>
        <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> No</button>
      </div>
        </div>
    <!-- /.modal-content --> 
  </div>
        
