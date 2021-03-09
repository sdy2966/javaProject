		System.out.println("오디오끔");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIX_VOLUME) {
			this.volume = RemoteControl.MIX_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 오디오 볼륨은" + volume);
	}

}