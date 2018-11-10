import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

def call(String channel) {
	node {
	    JSONArray attachments = new JSONArray();
	    JSONObject attachment = new JSONObject();

	    attachment.put('title','Jenkins is starting a build');
	    attachment.put('text','Hold onto your Butts!');
	    attachment.put('fallback','Ruh Roh!');
	    attachment.put('image_url','https://butt.holdings/hold-onto-your-butts.gif');
	    attachment.put('color','#FF00E0');

	    attachments.add(attachment);
	    slackSend(message: "Started <${env.JOB_URL}${env.JOB_NAME}> (<${env.BUILD_URL}|#${env.BUILD_NUMBER}>)",
	    	channel: "${channel}",
			color: "#764FA5",
	    	attachments: attachments.toString())
	}
}

def call(channel) {
	call channel: channel
}
