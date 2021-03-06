package com.ysl3000.chunkster.event;

import org.bukkit.Chunk;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ChunkEvent extends Event implements Cancellable{
	private Player p;
	private Chunk ch;
	private boolean success;
	private static final HandlerList handlers = new HandlerList();

	public HandlerList getHandlers() {
		return handlers;
	}
	public static HandlerList getHandlerList() {
		return handlers;
	}
	public ChunkEvent(Player p, Chunk ch,boolean success){
		this.p=p;
		this.ch=ch;
		this.success=success;
	}
	public Player getPlayer(){
		return p;
	}
	public Chunk getChunk(){
		return ch;
	}
	@Override
	public boolean isCancelled() {
		return success;
	}
	@Override
	public void setCancelled(boolean arg0) {
		this.success = arg0;
		
	}
}
