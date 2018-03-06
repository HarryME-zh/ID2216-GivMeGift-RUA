# ID2216-GivMeGift-RUA

This is a project of ID2212. We have created an app by using the Amazon advertising API.

### Web App

In the Web App folder, the file to call the guzzle and handle the API is amazonsearcher.php and ./lib/Amazon.php. The result will be returned and displayed in amazonsearcher.html

What you need to do is to modify the ./.env and add your own associate tag and key, deploy it on the apache, then everything will be OK.

### Native App

In the Native app folder, the request is sent as a http request in java. The file is ./app/src/main/java/com/example/RUA/myapplication/TestApi.java. You also need to add your key and ID to make it work. Besides that, the result is returned as a XML file, so we have  also create several class to handle the data processing. See XmlUtil.java and ProcessXML.java

The following are the example figures:

<div align=center><img width="€œ€œ200"€œ height="€œ400"€œ alt="€œWeb App Amazon API"€œ src="https://github.com/Mr-Hongyi/ID2216-GivMeGift-RUA/blob/master/Images/api.jpeg"/></div>

<div align=center><img width="€œ200"€œ height="€œ400"€œ€ alt="Native App Amazon API€" src="https://github.com/Mr-Hongyi/ID2216-GivMeGift-RUA/blob/master/Images/api_native.png"/></div>