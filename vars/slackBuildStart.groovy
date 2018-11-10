def call(String channel) {
	slackSendMessage message: "Started <${env.JOB_URL}. \
		|${env.JOB_NAME}> (<${env.BUILD_URL}|#${env.BUILD_NUMBER}>)\n \
		<https://butt.holdings>",
		channel: "${channel}"
}

def call(channel) {
	call channel: channel
}
