/*
 * Copyright (C) 2015 Naveen Kulkarni.
 *
 * This file is part of Bag of Words program.
 *
 * Bag of Words is free software: you can redistribute it and/or modify it 
 * under the terms of the GNU General Public License as published by the 
 * Free Software Foundation, either version 3 of the License, or 
 * (at your option) any later version.
 *
 * Bag of Words is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY 
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License 
 * for more details.
 *
 * You should have received a copy of the GNU General Public License along 
 * with Bag of Words program. If not, see <http://www.gnu.org/licenses/>.
 */

package ctrus.pa.bow.term.transformation;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;


public class ChunkTransformer extends BaseTransformer {

	private List<Character> _chunkChars = new ArrayList<Character>();
	
	public void addChunckChar(char c) {		
		_chunkChars.add(c);
	}
	
	@Override
	public String transform(String term) {
		String chunckTerms = term;
		for(Character c: _chunkChars) {
			chunckTerms = StringUtils.replaceChars(chunckTerms, c, ' ');			
		}
		// Remove multiple spaces with single space before returning
		return chunckTerms.replaceAll("\\s+", " ");
	}

}
