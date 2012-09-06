/*
 * LayerAdminService.java
 * 
 * Copyright (C) 2011
 * 
 * This file is part of Proyecto persistenceGeo
 * 
 * This software is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 2 of the License, or (at your option) any
 * later version.
 * 
 * This software is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this library; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 * 
 * As a special exception, if you link this library with other files to produce
 * an executable, this library does not by itself cause the resulting executable
 * to be covered by the GNU General Public License. This exception does not
 * however invalidate any other reasons why the executable file might be covered
 * by the GNU General Public License.
 * 
 * Authors:: Moisés Arcos Santiago (mailto:marcos@emergya.com)
 */
package com.emergya.persistenceGeo.service;

import java.util.List;

import com.emergya.persistenceGeo.dto.LayerDto;
import com.emergya.persistenceGeo.dto.RuleDto;
import com.emergya.persistenceGeo.dto.StyleDto;

/**
 * Layers Administration Interface 
 * 
 * @author <a href="mailto:marcos@emergya.com">marcos</a>
 *
 */
public interface LayerAdminService extends AbstractService {

	/**
	 * Get a layer list by name
	 * 
	 * @param layerName
	 * 
	 * @return If not found, it's created
	 */
	public List<LayerDto> getLayersByName(String layerName);
	
	/**
	 * Get a layer list by names list
	 * 
	 * @param namesList
	 * 
	 * @return If not found, it's created
	 */
	public List<LayerDto> getLayersByName(List<String> namesList);
	
	/**
	 * Get a styles list by layer
	 * 
	 * @param layer
	 * 
	 * @return If not found, it's created
	 */
	public List<StyleDto> getStylesByLayer(LayerDto layer);
	
	/**
	 * Get a rules list by layer style
	 * 
	 * @param style
	 * 
	 * @return If not found, it's created
	 */
	public List<RuleDto> getRulesByStyle(StyleDto style);
	
	/**
	 * Add a rule to a layer style
	 * 
	 * @param styleID
	 * @param ruleID
	 * 
	 */
	public void addRuleToStyleLayer(Long styleID, Long ruleID);
	
	/**
	 * Add a style to a layer
	 * 
	 * @param layerID
	 * @param styleID
	 * 
	 */
	public void addStyleToLayer(Long layerID, Long styleID);
	
	/**
	 * Add authorities to a layer
	 * 
	 * @param auth_id
	 * @param styleID
	 * 
	 */
	public void addAuthoritiesToLayer(Long auth_id, Long layer_id);
	
	/**
	 * Add a user to a layer
	 * 
	 * @param user_id
	 * @param layer_id
	 * 
	 */
	public void addUserToLayer(Long user_id, Long layer_id);
	
	/**
	 * Add a folder to a layer
	 * 
	 * @param folder_id
	 * @param layer_id
	 * 
	 */
	public void addFolderToLayer(Long folder_id, Long layer_id);
}