<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お問い合わせフォーム</title>
</head>
<body>

<h1>お問い合わせフォーム</h1>
<h2>お問い合わせ内容</h2>
	<form method="POST" action="action">
		お問い合わせの種類
		<input type="radio" name="a" value="item">商品についてのお問い合わせ
		<input type="radio" name="a" value="shipping">発送についてのお問い合わせ<br>
		件名<br>
		<input type="text" name="subject"><br>
		お問い合わせ内容<br>
		<textarea name="contents" cols="30" rows="10"></textarea><br>
	</form>
<h2>お客様情報</h2>
	<form method="POST" action="action">
		氏名<br>
		性：<input type="text" name="family-name">
		名：<input type="text" name="first-name"><br>
		ふりがな<br>
		せい：<input type="text" name="family-name-kana">
		めい：<input type="text" name="first-name-kana"><br>
		メールアドレス<br>
		<input type="email" name="mailaddress"><br>
		メールアドレス(確認用)<br>
		<input type="email" name="mailaddress"><br>
		<input type="submit" name="送信">
	</form>

</body>
</html>