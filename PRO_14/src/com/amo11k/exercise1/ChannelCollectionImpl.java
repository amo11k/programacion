package com.amo11k.exercise1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {
	private List<Channel> channelsList = new ArrayList<Channel>();

	@Override
	public void addChannel(Channel c) {
		channelsList.add(c);

	}

	@Override
	public void removeChannel(Channel c) {
		channelsList.remove(c);

	}

	@Override
	public ChannelIterator iterator(ChannelTypeEnum type) {
		return new ChannelRepository(type);
	}

	private class ChannelRepository implements ChannelIterator {
		Iterator<Channel> it;
		ChannelTypeEnum type;
		int index;

		public ChannelRepository(ChannelTypeEnum type) {
			this.type = type;
			it = channelsList.iterator();
		}

		@Override
		public boolean hasNext() {
			return it.hasNext();
		}

		@Override
		public Channel next() {
			while (it.hasNext()) {
				Channel c = it.next();
				if (type == ChannelTypeEnum.ALL)
					return c;				
				else if (c.getTYPE() == type)
					return c;
			}
			return null;
		}

	}

}
