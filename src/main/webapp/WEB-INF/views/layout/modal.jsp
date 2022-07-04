<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	language="java"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<title>Center Modal</title>

<style>
table {
	width: 400px;
	border-color: white;
	border-collapse: collapse;
	border-spacing: 0 120px;
}

tr.space {
  border-bottom: 40px solid #fff;
}

#homemodal {
	display: none;
	width: auto;
	padding: 20px 60px;
	background-color: #fefefe;
	border: 1px solid #888;
	border-radius: 3px;
}

#homemodal .modal_close_btn {
	position: absolute;
	top: 10px;
	right: 10px;
}
</style>
<script>
	function modal(id) {
		var zIndex = 9999;
		var modal = document.getElementById(id);
	
		var bg = document.createElement('div');
		bg.setStyle({
			position : 'fixed',
			zIndex : zIndex,
			left : '0px',
			top : '0px',
			width : '100%',
			height : '100%',
			overflow : 'auto',
			backgroundColor : 'rgba(0,0,0,0.4)'
		});
		document.body.append(bg);
	
		modal.querySelector('.modal_close_btn').addEventListener('click',
			function() {
				bg.remove();
				modal.style.display = 'none';
			});
		modal.setStyle({
			position : 'fixed',
			display : 'block',
			boxShadow : '0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19)',
			zIndex : zIndex + 1,
			top : '50%',
			left : '50%',
			transform : 'translate(-50%, -50%)',
			msTransform : 'translate(-50%, -50%)',
			webkitTransform : 'translate(-50%, -50%)'
		});
	}

	Element.prototype.setStyle = function(styles) {
		for (var k in styles)
			this.style[k] = styles[k];
		return this;
	};

	document.getElementById('popup_open_btn').addEventListener('click',
		function() {
			modal('homemodal');
		});
</script>

</head>

<body>
	<div id="homemodal">
		<table>
			<tr>
				<th>[목표]</th>
				<td> Spring CRUD 기반 웹서비스 구현과 확장</td>
			</tr>
			<tr class="space">
				<th></th>
				<td> 그리고 '?'</td>
			</tr>
			<tr>
				<th>[유의]</th>
				<td> login 안할 시 Read 외 기능 제한</td>
			</tr>
		</table>

		<a class="modal_close_btn">닫기</a>
	</div>
</body>
</html>