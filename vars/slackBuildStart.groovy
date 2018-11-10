def call(String channel) {
	slackSend message: "Started <${env.JOB_URL}|${env.JOB_NAME}>|(<${env.BUILD_URL}|#${env.BUILD_NUMBER}>)",
		attachment: 'https://butt.holdings/hold-onto-your-butts.gif',
		channel: "${channel}",
		color: "#764FA5"
}

def call(channel) {
	call channel: channel
}
