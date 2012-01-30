
/***************************************************************************
 *   Copyright 2006-2009 by Christian Ihle                                 *
 *   kontakt@usikkert.net                                                  *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *                                                                         *
 *   This program is distributed in the hope that it will be useful,       *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
 *   GNU General Public License for more details.                          *
 *                                                                         *
 *   You should have received a copy of the GNU General Public License     *
 *   along with this program; if not, write to the                         *
 *   Free Software Foundation, Inc.,                                       *
 *   59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.             *
 ***************************************************************************/

package net.usikkert.kouchat.misc;

/**
 * This is a JMX MBean for the controller.
 *
 * @author Christian Ihle
 */
public class ControllerInformation implements ControllerInformationMBean
{
	/** The controller. */
	private final Controller controller;

	/**
	 * Constructor.
	 *
	 * @param controller The controller.
	 */
	public ControllerInformation( final Controller controller )
	{
		this.controller = controller;
	}

	/** {@inheritDoc} */
	@Override
	public void logOn()
	{
		controller.logOn();
	}

	/** {@inheritDoc} */
	@Override
	public void logOff()
	{
		controller.logOff( true );
	}
}